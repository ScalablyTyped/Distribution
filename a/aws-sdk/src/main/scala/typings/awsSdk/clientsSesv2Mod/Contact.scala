package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contact extends StObject {
  
  /**
    * The contact's email address.
    */
  var EmailAddress: js.UndefOr[typings.awsSdk.clientsSesv2Mod.EmailAddress] = js.undefined
  
  /**
    * A timestamp noting the last time the contact's information was updated.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The default topic preferences applied to the contact.
    */
  var TopicDefaultPreferences: js.UndefOr[TopicPreferenceList] = js.undefined
  
  /**
    * The contact's preference for being opted-in to or opted-out of a topic.
    */
  var TopicPreferences: js.UndefOr[TopicPreferenceList] = js.undefined
  
  /**
    * A boolean value status noting if the contact is unsubscribed from all contact list topics.
    */
  var UnsubscribeAll: js.UndefOr[typings.awsSdk.clientsSesv2Mod.UnsubscribeAll] = js.undefined
}
object Contact {
  
  inline def apply(): Contact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Contact]
  }
  
  extension [Self <: Contact](x: Self) {
    
    inline def setEmailAddress(value: EmailAddress): Self = StObject.set(x, "EmailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "EmailAddress", js.undefined)
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setTopicDefaultPreferences(value: TopicPreferenceList): Self = StObject.set(x, "TopicDefaultPreferences", value.asInstanceOf[js.Any])
    
    inline def setTopicDefaultPreferencesUndefined: Self = StObject.set(x, "TopicDefaultPreferences", js.undefined)
    
    inline def setTopicDefaultPreferencesVarargs(value: TopicPreference*): Self = StObject.set(x, "TopicDefaultPreferences", js.Array(value*))
    
    inline def setTopicPreferences(value: TopicPreferenceList): Self = StObject.set(x, "TopicPreferences", value.asInstanceOf[js.Any])
    
    inline def setTopicPreferencesUndefined: Self = StObject.set(x, "TopicPreferences", js.undefined)
    
    inline def setTopicPreferencesVarargs(value: TopicPreference*): Self = StObject.set(x, "TopicPreferences", js.Array(value*))
    
    inline def setUnsubscribeAll(value: UnsubscribeAll): Self = StObject.set(x, "UnsubscribeAll", value.asInstanceOf[js.Any])
    
    inline def setUnsubscribeAllUndefined: Self = StObject.set(x, "UnsubscribeAll", js.undefined)
  }
}
