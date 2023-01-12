package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickConnectSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the quick connect.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the quick connect.
    */
  var Id: js.UndefOr[QuickConnectId] = js.undefined
  
  /**
    * The name of the quick connect.
    */
  var Name: js.UndefOr[QuickConnectName] = js.undefined
  
  /**
    * The type of quick connect. In the Amazon Connect console, when you create a quick connect, you are prompted to assign one of the following types: Agent (USER), External (PHONE_NUMBER), or Queue (QUEUE).
    */
  var QuickConnectType: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnectType] = js.undefined
}
object QuickConnectSummary {
  
  inline def apply(): QuickConnectSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickConnectSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuickConnectSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: QuickConnectId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: QuickConnectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setQuickConnectType(value: QuickConnectType): Self = StObject.set(x, "QuickConnectType", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectTypeUndefined: Self = StObject.set(x, "QuickConnectType", js.undefined)
  }
}
