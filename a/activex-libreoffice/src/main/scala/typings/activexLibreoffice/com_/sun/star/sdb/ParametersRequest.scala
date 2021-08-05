package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.sdbc.XConnection
import typings.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typings.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * an error specifying the lack of parameters values
  *
  * Usually thrown if someone tries to execute an SQL statement containing parameters which can't be filled by the executing instance.
  */
trait ParametersRequest
  extends StObject
     with ClassifiedInteractionRequest {
  
  /**
    * specifies the connection on which the statement is to be executed. Somebody handling the request could, e.g., use the connection for determining the
    * identifier quote string, etc.
    */
  var Connection: XConnection
  
  /**
    * is the list of parameters requested. The objects returned by the {@link com.sun.star.container.XIndexAccess} have to be property sets describing the
    * respective parameter. For this, the objects have to support the service {@link com.sun.star.sdbcx.Column} .
    */
  var Parameters: XIndexAccess
}
object ParametersRequest {
  
  inline def apply(
    Classification: InteractionClassification,
    Connection: XConnection,
    Context: XInterface,
    Message: String,
    Parameters: XIndexAccess
  ): ParametersRequest = {
    val __obj = js.Dynamic.literal(Classification = Classification.asInstanceOf[js.Any], Connection = Connection.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersRequest]
  }
  
  extension [Self <: ParametersRequest](x: Self) {
    
    inline def setConnection(value: XConnection): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: XIndexAccess): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
  }
}
