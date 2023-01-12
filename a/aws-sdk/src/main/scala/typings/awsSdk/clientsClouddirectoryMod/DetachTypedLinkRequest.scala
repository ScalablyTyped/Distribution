package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachTypedLinkRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to detach the typed link.
    */
  var DirectoryArn: Arn
  
  /**
    * Used to accept a typed link specifier as input.
    */
  var TypedLinkSpecifier: typings.awsSdk.clientsClouddirectoryMod.TypedLinkSpecifier
}
object DetachTypedLinkRequest {
  
  inline def apply(DirectoryArn: Arn, TypedLinkSpecifier: TypedLinkSpecifier): DetachTypedLinkRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], TypedLinkSpecifier = TypedLinkSpecifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachTypedLinkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachTypedLinkRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setTypedLinkSpecifier(value: TypedLinkSpecifier): Self = StObject.set(x, "TypedLinkSpecifier", value.asInstanceOf[js.Any])
  }
}
