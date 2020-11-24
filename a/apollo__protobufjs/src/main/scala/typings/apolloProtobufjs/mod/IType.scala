package typings.apolloProtobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.apolloProtobufjs.mod.AnyNestedObject because Already inherited */ @js.native
trait IType extends INamespace {
  
  /** Extension ranges */
  var extensions: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  /** Field descriptors */
  var fields: StringDictionary[js.UndefOr[IField]] = js.native
  
  /** Whether a legacy group or not */
  var group: js.UndefOr[Boolean] = js.native
  
  /** Oneof descriptors */
  var oneofs: js.UndefOr[StringDictionary[js.UndefOr[IOneOf]]] = js.native
  
  /** Reserved ranges */
  var reserved: js.UndefOr[js.Array[js.Array[Double]]] = js.native
}
object IType {
  
  @scala.inline
  def apply(fields: StringDictionary[js.UndefOr[IField]]): IType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[IType]
  }
  
  @scala.inline
  implicit class ITypeOps[Self <: IType] (val x: Self) extends AnyVal {
    
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
    def setFields(value: StringDictionary[js.UndefOr[IField]]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsVarargs(value: js.Array[Double]*): Self = this.set("extensions", js.Array(value :_*))
    
    @scala.inline
    def setExtensions(value: js.Array[js.Array[Double]]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    
    @scala.inline
    def setGroup(value: Boolean): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setOneofs(value: StringDictionary[js.UndefOr[IOneOf]]): Self = this.set("oneofs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneofs: Self = this.set("oneofs", js.undefined)
    
    @scala.inline
    def setReservedVarargs(value: js.Array[Double]*): Self = this.set("reserved", js.Array(value :_*))
    
    @scala.inline
    def setReserved(value: js.Array[js.Array[Double]]): Self = this.set("reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
  }
}
