package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QuickConnect extends StObject {
  
  /**
    * The description.
    */
  var Description: js.UndefOr[QuickConnectDescription] = js.undefined
  
  /**
    * The name of the quick connect.
    */
  var Name: js.UndefOr[QuickConnectName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the quick connect.
    */
  var QuickConnectARN: js.UndefOr[ARN] = js.undefined
  
  /**
    * Contains information about the quick connect.
    */
  var QuickConnectConfig: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnectConfig] = js.undefined
  
  /**
    * The identifier for the quick connect.
    */
  var QuickConnectId: js.UndefOr[typings.awsSdk.clientsConnectMod.QuickConnectId] = js.undefined
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object QuickConnect {
  
  inline def apply(): QuickConnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuickConnect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QuickConnect] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: QuickConnectDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: QuickConnectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setQuickConnectARN(value: ARN): Self = StObject.set(x, "QuickConnectARN", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectARNUndefined: Self = StObject.set(x, "QuickConnectARN", js.undefined)
    
    inline def setQuickConnectConfig(value: QuickConnectConfig): Self = StObject.set(x, "QuickConnectConfig", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectConfigUndefined: Self = StObject.set(x, "QuickConnectConfig", js.undefined)
    
    inline def setQuickConnectId(value: QuickConnectId): Self = StObject.set(x, "QuickConnectId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectIdUndefined: Self = StObject.set(x, "QuickConnectId", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
