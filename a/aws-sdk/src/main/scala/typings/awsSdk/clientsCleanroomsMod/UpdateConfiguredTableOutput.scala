package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConfiguredTableOutput extends StObject {
  
  /**
    * The updated configured table.
    */
  var configuredTable: ConfiguredTable
}
object UpdateConfiguredTableOutput {
  
  inline def apply(configuredTable: ConfiguredTable): UpdateConfiguredTableOutput = {
    val __obj = js.Dynamic.literal(configuredTable = configuredTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConfiguredTableOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConfiguredTableOutput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTable(value: ConfiguredTable): Self = StObject.set(x, "configuredTable", value.asInstanceOf[js.Any])
  }
}
