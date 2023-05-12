package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfiguredTableOutput extends StObject {
  
  /**
    * The created configured table.
    */
  var configuredTable: ConfiguredTable
}
object CreateConfiguredTableOutput {
  
  inline def apply(configuredTable: ConfiguredTable): CreateConfiguredTableOutput = {
    val __obj = js.Dynamic.literal(configuredTable = configuredTable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfiguredTableOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateConfiguredTableOutput] (val x: Self) extends AnyVal {
    
    inline def setConfiguredTable(value: ConfiguredTable): Self = StObject.set(x, "configuredTable", value.asInstanceOf[js.Any])
  }
}
