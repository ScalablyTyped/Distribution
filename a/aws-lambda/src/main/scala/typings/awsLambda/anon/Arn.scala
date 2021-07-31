package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arn extends StObject {
  
  var arn: String
  
  var name: String
  
  var ownerIdentity: PrincipalId
}
object Arn {
  
  @scala.inline
  def apply(arn: String, name: String, ownerIdentity: PrincipalId): Arn = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], ownerIdentity = ownerIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arn]
  }
  
  @scala.inline
  implicit class ArnMutableBuilder[Self <: Arn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdentity(value: PrincipalId): Self = StObject.set(x, "ownerIdentity", value.asInstanceOf[js.Any])
  }
}
