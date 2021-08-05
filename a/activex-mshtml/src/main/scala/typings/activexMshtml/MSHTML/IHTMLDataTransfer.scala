package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLDataTransfer extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLDataTransfer_typekey")
  var MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer
  
  def clearData(format: String): Boolean
  
  var dropEffect: String
  
  var effectAllowed: String
  
  def getData(format: String): js.Any
  
  def setData(format: String, data: js.Any): Boolean
}
object IHTMLDataTransfer {
  
  inline def apply(
    MSHTMLDotIHTMLDataTransfer_typekey: IHTMLDataTransfer,
    clearData: String => Boolean,
    dropEffect: String,
    effectAllowed: String,
    getData: String => js.Any,
    setData: (String, js.Any) => Boolean
  ): IHTMLDataTransfer = {
    val __obj = js.Dynamic.literal(clearData = js.Any.fromFunction1(clearData), dropEffect = dropEffect.asInstanceOf[js.Any], effectAllowed = effectAllowed.asInstanceOf[js.Any], getData = js.Any.fromFunction1(getData), setData = js.Any.fromFunction2(setData))
    __obj.updateDynamic("MSHTML.IHTMLDataTransfer_typekey")(MSHTMLDotIHTMLDataTransfer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDataTransfer]
  }
  
  extension [Self <: IHTMLDataTransfer](x: Self) {
    
    inline def setClearData(value: String => Boolean): Self = StObject.set(x, "clearData", js.Any.fromFunction1(value))
    
    inline def setDropEffect(value: String): Self = StObject.set(x, "dropEffect", value.asInstanceOf[js.Any])
    
    inline def setEffectAllowed(value: String): Self = StObject.set(x, "effectAllowed", value.asInstanceOf[js.Any])
    
    inline def setGetData(value: String => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    inline def setMSHTMLDotIHTMLDataTransfer_typekey(value: IHTMLDataTransfer): Self = StObject.set(x, "MSHTML.IHTMLDataTransfer_typekey", value.asInstanceOf[js.Any])
    
    inline def setSetData(value: (String, js.Any) => Boolean): Self = StObject.set(x, "setData", js.Any.fromFunction2(value))
  }
}
