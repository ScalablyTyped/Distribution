package typings.apidevtoolsJsonSchemaRefParser.anon

import typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.ignore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Circular extends js.Object {
  
  /**
    * Determines whether circular `$ref` pointers are handled.
    *
    * If set to `false`, then a `ReferenceError` will be thrown if the schema contains any circular references.
    *
    * If set to `"ignore"`, then circular references will simply be ignored. No error will be thrown, but the `$Refs.circular` property will still be set to `true`.
    */
  var circular: js.UndefOr[Boolean | ignore] = js.native
}
object Circular {
  
  @scala.inline
  def apply(): Circular = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Circular]
  }
  
  @scala.inline
  implicit class CircularOps[Self <: Circular] (val x: Self) extends AnyVal {
    
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
    def setCircular(value: Boolean | ignore): Self = this.set("circular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCircular: Self = this.set("circular", js.undefined)
  }
}
