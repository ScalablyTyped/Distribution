package typings.angularCompiler.t2ApiMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectiveMeta extends js.Object {
  /**
    * Name under which the directive is exported, if any (exportAs in Angular).
    *
    * Null otherwise
    */
  var exportAs: js.Array[String] | Null = js.native
  /**
    * Set of inputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var inputs: StringDictionary[String | (js.Tuple2[String, String])] = js.native
  /**
    * Whether the directive is a component.
    */
  var isComponent: Boolean = js.native
  /**
    * Name of the directive class (used for debugging).
    */
  var name: String = js.native
  /**
    * Set of outputs which this directive claims.
    *
    * Goes from property names to field names.
    */
  var outputs: StringDictionary[String] = js.native
}

object DirectiveMeta {
  @scala.inline
  def apply(
    inputs: StringDictionary[String | (js.Tuple2[String, String])],
    isComponent: Boolean,
    name: String,
    outputs: StringDictionary[String]
  ): DirectiveMeta = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveMeta]
  }
  @scala.inline
  implicit class DirectiveMetaOps[Self <: DirectiveMeta] (val x: Self) extends AnyVal {
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
    def setInputs(value: StringDictionary[String | (js.Tuple2[String, String])]): Self = this.set("inputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsComponent(value: Boolean): Self = this.set("isComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputs(value: StringDictionary[String]): Self = this.set("outputs", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportAsVarargs(value: String*): Self = this.set("exportAs", js.Array(value :_*))
    @scala.inline
    def setExportAs(value: js.Array[String]): Self = this.set("exportAs", value.asInstanceOf[js.Any])
    @scala.inline
    def setExportAsNull: Self = this.set("exportAs", null)
  }
  
}

