package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateMachineListItem extends StObject {
  
  /**
    * The date the state machine is created.
    */
  var creationDate: js.Date
  
  /**
    * The name of the state machine. A name must not contain:   white space   brackets &lt; &gt; { } [ ]    wildcard characters ? *    special characters " # % \ ^ | ~ ` $ &amp; , ; : /    control characters (U+0000-001F, U+007F-009F)   To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
    */
  var name: Name
  
  /**
    * The Amazon Resource Name (ARN) that identifies the state machine.
    */
  var stateMachineArn: Arn
  
  /**
    * 
    */
  var `type`: StateMachineType
}
object StateMachineListItem {
  
  inline def apply(creationDate: js.Date, name: Name, stateMachineArn: Arn, `type`: StateMachineType): StateMachineListItem = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stateMachineArn = stateMachineArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateMachineListItem]
  }
  
  extension [Self <: StateMachineListItem](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStateMachineArn(value: Arn): Self = StObject.set(x, "stateMachineArn", value.asInstanceOf[js.Any])
    
    inline def setType(value: StateMachineType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
