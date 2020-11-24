package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait cimSymbolUtils extends js.Object {
  
  /**
    * Sets the color of the symbol layers of a CIMSymbol to a given value if the symbol layer is not color locked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#applyCIMSymbolColor)
    */
  def applyCIMSymbolColor(symbol: CIMSymbol, color: Color_): Unit = js.native
  
  /**
    * Sets the rotation value of a CIMSymbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#applyCIMSymbolRotation)
    */
  def applyCIMSymbolRotation(symbol: CIMSymbol, rotation: Double): Unit = js.native
  
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
  def scaleCIMSymbolTo(symbol: CIMSymbol, size: Double): Unit = js.native
}
object cimSymbolUtils {
  
  @scala.inline
  def apply(
    applyCIMSymbolColor: (CIMSymbol, Color_) => Unit,
    applyCIMSymbolRotation: (CIMSymbol, Double) => Unit,
    getCIMSymbolColor: CIMSymbol => Color_,
    getCIMSymbolRotation: CIMSymbol => Double,
    getCIMSymbolSize: CIMSymbol => Double,
    scaleCIMSymbolTo: (CIMSymbol, Double) => Unit
  ): cimSymbolUtils = {
    val __obj = js.Dynamic.literal(applyCIMSymbolColor = js.Any.fromFunction2(applyCIMSymbolColor), applyCIMSymbolRotation = js.Any.fromFunction2(applyCIMSymbolRotation), getCIMSymbolColor = js.Any.fromFunction1(getCIMSymbolColor), getCIMSymbolRotation = js.Any.fromFunction1(getCIMSymbolRotation), getCIMSymbolSize = js.Any.fromFunction1(getCIMSymbolSize), scaleCIMSymbolTo = js.Any.fromFunction2(scaleCIMSymbolTo))
    __obj.asInstanceOf[cimSymbolUtils]
  }
  
  @scala.inline
  implicit class cimSymbolUtilsOps[Self <: cimSymbolUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyCIMSymbolColor(value: (CIMSymbol, Color_) => Unit): Self = this.set("applyCIMSymbolColor", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApplyCIMSymbolRotation(value: (CIMSymbol, Double) => Unit): Self = this.set("applyCIMSymbolRotation", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCIMSymbolColor(value: CIMSymbol => Color_): Self = this.set("getCIMSymbolColor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCIMSymbolRotation(value: CIMSymbol => Double): Self = this.set("getCIMSymbolRotation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCIMSymbolSize(value: CIMSymbol => Double): Self = this.set("getCIMSymbolSize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScaleCIMSymbolTo(value: (CIMSymbol, Double) => Unit): Self = this.set("scaleCIMSymbolTo", js.Any.fromFunction2(value))
  }
}
