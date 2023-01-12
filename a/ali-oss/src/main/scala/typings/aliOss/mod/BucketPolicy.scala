package typings.aliOss.mod

import typings.aliOss.anon.Action
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketPolicy extends StObject {
  
  var Statement: js.Array[Action]
  
  var Version: String
}
object BucketPolicy {
  
  inline def apply(Statement: js.Array[Action], Version: String): BucketPolicy = {
    val __obj = js.Dynamic.literal(Statement = Statement.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BucketPolicy] (val x: Self) extends AnyVal {
    
    inline def setStatement(value: js.Array[Action]): Self = StObject.set(x, "Statement", value.asInstanceOf[js.Any])
    
    inline def setStatementVarargs(value: Action*): Self = StObject.set(x, "Statement", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
