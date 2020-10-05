package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceNameToFileName extends js.Object {
  def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null = js.native
}

object ResourceNameToFileName {
  @scala.inline
  def apply(resourceNameToFileName: (String, String) => String | Null): ResourceNameToFileName = {
    val __obj = js.Dynamic.literal(resourceNameToFileName = js.Any.fromFunction2(resourceNameToFileName))
    __obj.asInstanceOf[ResourceNameToFileName]
  }
  @scala.inline
  implicit class ResourceNameToFileNameOps[Self <: ResourceNameToFileName] (val x: Self) extends AnyVal {
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
    def setResourceNameToFileName(value: (String, String) => String | Null): Self = this.set("resourceNameToFileName", js.Any.fromFunction2(value))
  }
  
}

