package typings.amapJsApi.anon

import typings.amapJsApi.AMap.Bounds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.Rectangle<any>, keyof amap-js-api.AMap.Polygon<any>> */
trait OmitRectangleanykeyofPoly extends StObject {
  
  def setBounds(bounds: Bounds): Unit
  def setBounds(bounds: Bounds, preventEvent: Boolean): Unit
  @JSName("setBounds")
  var setBounds_Original: js.Function2[/* bounds */ Bounds, /* preventEvent */ js.UndefOr[Boolean], Unit]
}
object OmitRectangleanykeyofPoly {
  
  inline def apply(setBounds: (/* bounds */ Bounds, /* preventEvent */ js.UndefOr[Boolean]) => Unit): OmitRectangleanykeyofPoly = {
    val __obj = js.Dynamic.literal(setBounds = js.Any.fromFunction2(setBounds))
    __obj.asInstanceOf[OmitRectangleanykeyofPoly]
  }
  
  extension [Self <: OmitRectangleanykeyofPoly](x: Self) {
    
    inline def setSetBounds(value: (/* bounds */ Bounds, /* preventEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setBounds", js.Any.fromFunction2(value))
  }
}
