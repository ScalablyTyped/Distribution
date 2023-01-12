package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConferencePreference extends StObject {
  
  /**
    * The ARN of the default conference provider.
    */
  var DefaultConferenceProviderArn: js.UndefOr[Arn] = js.undefined
}
object ConferencePreference {
  
  inline def apply(): ConferencePreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferencePreference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConferencePreference] (val x: Self) extends AnyVal {
    
    inline def setDefaultConferenceProviderArn(value: Arn): Self = StObject.set(x, "DefaultConferenceProviderArn", value.asInstanceOf[js.Any])
    
    inline def setDefaultConferenceProviderArnUndefined: Self = StObject.set(x, "DefaultConferenceProviderArn", js.undefined)
  }
}
