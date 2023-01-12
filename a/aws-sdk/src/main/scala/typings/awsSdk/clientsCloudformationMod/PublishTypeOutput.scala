package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishTypeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) assigned to the public extension upon publication.
    */
  var PublicTypeArn: js.UndefOr[TypeArn] = js.undefined
}
object PublishTypeOutput {
  
  inline def apply(): PublishTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishTypeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublishTypeOutput] (val x: Self) extends AnyVal {
    
    inline def setPublicTypeArn(value: TypeArn): Self = StObject.set(x, "PublicTypeArn", value.asInstanceOf[js.Any])
    
    inline def setPublicTypeArnUndefined: Self = StObject.set(x, "PublicTypeArn", js.undefined)
  }
}
