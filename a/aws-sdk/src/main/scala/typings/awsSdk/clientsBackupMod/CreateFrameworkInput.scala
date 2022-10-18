package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFrameworkInput extends StObject {
  
  /**
    * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and scope.
    */
  var FrameworkControls: typings.awsSdk.clientsBackupMod.FrameworkControls
  
  /**
    * An optional description of the framework with a maximum of 1,024 characters.
    */
  var FrameworkDescription: js.UndefOr[typings.awsSdk.clientsBackupMod.FrameworkDescription] = js.undefined
  
  /**
    * The unique name of the framework. The name must be between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
    */
  var FrameworkName: typings.awsSdk.clientsBackupMod.FrameworkName
  
  /**
    * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
    */
  var FrameworkTags: js.UndefOr[stringMap] = js.undefined
  
  /**
    * A customer-chosen string that you can use to distinguish between otherwise identical calls to CreateFrameworkInput. Retrying a successful request with the same idempotency token results in a success message with no action taken.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
}
object CreateFrameworkInput {
  
  inline def apply(FrameworkControls: FrameworkControls, FrameworkName: FrameworkName): CreateFrameworkInput = {
    val __obj = js.Dynamic.literal(FrameworkControls = FrameworkControls.asInstanceOf[js.Any], FrameworkName = FrameworkName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFrameworkInput]
  }
  
  extension [Self <: CreateFrameworkInput](x: Self) {
    
    inline def setFrameworkControls(value: FrameworkControls): Self = StObject.set(x, "FrameworkControls", value.asInstanceOf[js.Any])
    
    inline def setFrameworkControlsVarargs(value: FrameworkControl*): Self = StObject.set(x, "FrameworkControls", js.Array(value*))
    
    inline def setFrameworkDescription(value: FrameworkDescription): Self = StObject.set(x, "FrameworkDescription", value.asInstanceOf[js.Any])
    
    inline def setFrameworkDescriptionUndefined: Self = StObject.set(x, "FrameworkDescription", js.undefined)
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
    
    inline def setFrameworkTags(value: stringMap): Self = StObject.set(x, "FrameworkTags", value.asInstanceOf[js.Any])
    
    inline def setFrameworkTagsUndefined: Self = StObject.set(x, "FrameworkTags", js.undefined)
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
  }
}
