package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A classified interaction request. */
trait ClassifiedInteractionRequest
  extends StObject
     with Exception {
  
  /** The classification of the request. */
  var Classification: InteractionClassification
}
object ClassifiedInteractionRequest {
  
  inline def apply(Classification: InteractionClassification, Context: XInterface, Message: String): ClassifiedInteractionRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassifiedInteractionRequest]
  }
  
  extension [Self <: ClassifiedInteractionRequest](x: Self) {
    
    inline def setClassification(value: InteractionClassification): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
  }
}
