package typings.angularCompiler.compilerFacadeInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R3QueryMetadataFacade extends js.Object {
  var descendants: Boolean = js.native
  var first: Boolean = js.native
  var predicate: js.Any | js.Array[String] = js.native
  var propertyName: String = js.native
  var read: js.Any | Null = js.native
  var static: Boolean = js.native
}

object R3QueryMetadataFacade {
  @scala.inline
  def apply(
    descendants: Boolean,
    first: Boolean,
    predicate: js.Any | js.Array[String],
    propertyName: String,
    static: Boolean
  ): R3QueryMetadataFacade = {
    val __obj = js.Dynamic.literal(descendants = descendants.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any], propertyName = propertyName.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.asInstanceOf[R3QueryMetadataFacade]
  }
  @scala.inline
  implicit class R3QueryMetadataFacadeOps[Self <: R3QueryMetadataFacade] (val x: Self) extends AnyVal {
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
    def setFirst(value: Boolean): Self = this.set("first", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicateVarargs(value: String*): Self = this.set("predicate", js.Array(value :_*))
    @scala.inline
    def setPredicate(value: js.Any | js.Array[String]): Self = this.set("predicate", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatic(value: Boolean): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def setRead(value: js.Any): Self = this.set("read", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadNull: Self = this.set("read", null)
  }
  
}

