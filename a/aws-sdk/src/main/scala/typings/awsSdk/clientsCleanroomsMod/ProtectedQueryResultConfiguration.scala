package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtectedQueryResultConfiguration extends StObject {
  
  /**
    * Configuration for protected query results.
    */
  var outputConfiguration: ProtectedQueryOutputConfiguration
}
object ProtectedQueryResultConfiguration {
  
  inline def apply(outputConfiguration: ProtectedQueryOutputConfiguration): ProtectedQueryResultConfiguration = {
    val __obj = js.Dynamic.literal(outputConfiguration = outputConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedQueryResultConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtectedQueryResultConfiguration] (val x: Self) extends AnyVal {
    
    inline def setOutputConfiguration(value: ProtectedQueryOutputConfiguration): Self = StObject.set(x, "outputConfiguration", value.asInstanceOf[js.Any])
  }
}
