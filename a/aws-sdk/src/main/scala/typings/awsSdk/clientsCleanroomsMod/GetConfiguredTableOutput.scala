package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConfiguredTableOutput extends StObject {
  
  /**
    * The retrieved configured table.
    */
  var configuredTable: ConfiguredTable
}
object GetConfiguredTableOutput {
  
  inline def apply(configuredTable: ConfiguredTable): GetConfiguredTableOutput = {
    val __obj = js.Dynamic.literal(configuredTable = configuredTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConfiguredTableOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConfiguredTableOutput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTable(value: ConfiguredTable): Self = StObject.set(x, "configuredTable", value.asInstanceOf[js.Any])
  }
}
