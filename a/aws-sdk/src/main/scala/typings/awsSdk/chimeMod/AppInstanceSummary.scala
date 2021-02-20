package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppInstanceSummary extends StObject {
  
  /**
    * The app instance ARN.
    */
  var AppInstanceArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The metadata of the app instance summary.
    */
  var Metadata: js.UndefOr[typings.awsSdk.chimeMod.Metadata] = js.native
  
  /**
    * The name of the app instance summary.
    */
  var Name: js.UndefOr[NonEmptyResourceName] = js.native
}
object AppInstanceSummary {
  
  @scala.inline
  def apply(): AppInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppInstanceSummary]
  }
  
  @scala.inline
  implicit class AppInstanceSummaryMutableBuilder[Self <: AppInstanceSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppInstanceArn(value: ChimeArn): Self = StObject.set(x, "AppInstanceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppInstanceArnUndefined: Self = StObject.set(x, "AppInstanceArn", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
