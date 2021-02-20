package typings.aceBuilds.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fold extends StObject {
  
  var fold: typings.aceBuilds.mod.Ace.Fold = js.native
  
  var kind: String = js.native
}
object Fold {
  
  @scala.inline
  def apply(fold: typings.aceBuilds.mod.Ace.Fold, kind: String): Fold = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fold]
  }
  
  @scala.inline
  implicit class FoldMutableBuilder[Self <: Fold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFold(value: typings.aceBuilds.mod.Ace.Fold): Self = StObject.set(x, "fold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
