package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * Provides utility functions for [CIMSymbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html).
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html)
	 */
@js.native
trait cimSymbolUtils extends StObject {
  
  /**
  		 * Sets the color of the symbol layers of a CIMSymbol to a given value if the symbol layer is not color locked.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#applyCIMSymbolColor)
  		 */
  def applyCIMSymbolColor(symbol: CIMSymbol, color: Color_): scala.Unit = js.native
  def applyCIMSymbolColor(symbol: CIMSymbol, color: Color_, options: cimSymbolUtilsApplyCIMSymbolColorOptions): scala.Unit = js.native
  
  /**
  		 * Sets the rotation value of a CIMSymbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#applyCIMSymbolRotation)
  		 */
  def applyCIMSymbolRotation(symbol: CIMSymbol, rotation: Double): scala.Unit = js.native
  def applyCIMSymbolRotation(symbol: CIMSymbol, rotation: Double, clockwise: Boolean): scala.Unit = js.native
  
  /**
  		 * Returns the first color of the symbol layers in a CIMSymbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#getCIMSymbolColor)
  		 */
  def getCIMSymbolColor(symbol: CIMSymbol): Color_ = js.native
  
  /**
  		 * Returns the rotation value of a CIMSymbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#getCIMSymbolRotation)
  		 */
  def getCIMSymbolRotation(symbol: CIMSymbol): Double = js.native
  def getCIMSymbolRotation(symbol: CIMSymbol, clockwise: Boolean): Double = js.native
  
  /**
  		 * Returns the size of a given CIMSymbol.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#getCIMSymbolSize)
  		 */
  def getCIMSymbolSize(symbol: CIMSymbol): Double = js.native
  
  /**
  		 * Scales the largest layer of a CIMSymbol to a given size.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#scaleCIMSymbolTo)
  		 */
  def scaleCIMSymbolTo(symbol: CIMSymbol, size: Double): scala.Unit = js.native
  def scaleCIMSymbolTo(symbol: CIMSymbol, size: Double, options: cimSymbolUtilsScaleCIMSymbolToOptions): scala.Unit = js.native
}
