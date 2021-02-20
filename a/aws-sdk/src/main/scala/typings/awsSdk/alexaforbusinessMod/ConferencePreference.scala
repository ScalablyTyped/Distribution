package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConferencePreference extends StObject {
  
  /**
    * The ARN of the default conference provider.
    */
  var DefaultConferenceProviderArn: js.UndefOr[Arn] = js.native
}
object ConferencePreference {
  
  @scala.inline
  def apply(): ConferencePreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConferencePreference]
  }
  
  @scala.inline
  implicit class ConferencePreferenceMutableBuilder[Self <: ConferencePreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultConferenceProviderArn(value: Arn): Self = StObject.set(x, "DefaultConferenceProviderArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultConferenceProviderArnUndefined: Self = StObject.set(x, "DefaultConferenceProviderArn", js.undefined)
  }
}
