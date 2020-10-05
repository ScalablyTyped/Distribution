package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing query metadata extracted from query annotations.
  */
@js.native
trait TQueryMetadata extends js.Object {
  var descendants: Boolean = js.native
  var isStatic: Boolean = js.native
  var predicate: Type[_] | js.Array[String] = js.native
  var read: js.Any = js.native
}

object TQueryMetadata {
  @scala.inline
  def apply(descendants: Boolean, isStatic: Boolean, predicate: Type[_] | js.Array[String], read: js.Any): TQueryMetadata = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any])
    __obj.asInstanceOf[TQueryMetadata]
  }
  @scala.inline
  implicit class TQueryMetadataOps[Self <: TQueryMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescendants(value: Boolean): Self = this.set("descendants", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStatic(value: Boolean): Self = this.set("isStatic", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicateVarargs(value: String*): Self = this.set("predicate", js.Array(value :_*))
    @scala.inline
    def setPredicate(value: Type[_] | js.Array[String]): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: js.Any): Self = this.set("read", value.asInstanceOf[js.Any])
  }
  
}

