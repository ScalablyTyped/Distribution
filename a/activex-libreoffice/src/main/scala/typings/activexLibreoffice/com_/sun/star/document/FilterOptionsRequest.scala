package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typings.activexLibreoffice.com_.sun.star.frame.XModel
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is used for interaction handle to get filter options.
  * @since OOo 1.1.2
  */
trait FilterOptionsRequest
  extends StObject
     with Exception {
  
  /** The model of the document that should be provided to filters that supports {@link XExporter} interface. */
  var rModel: XModel
  
  /** The Media-descriptor of the document */
  var rProperties: SafeArray[PropertyValue]
}
object FilterOptionsRequest {
  
  inline def apply(Context: XInterface, Message: String, rModel: XModel, rProperties: SafeArray[PropertyValue]): FilterOptionsRequest = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], rModel = rModel.asInstanceOf[js.Any], rProperties = rProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterOptionsRequest] (val x: Self) extends AnyVal {
    
    inline def setRModel(value: XModel): Self = StObject.set(x, "rModel", value.asInstanceOf[js.Any])
    
    inline def setRProperties(value: SafeArray[PropertyValue]): Self = StObject.set(x, "rProperties", value.asInstanceOf[js.Any])
  }
}
