package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ObjectTypeCallPropertyKind
import typings.astTypes.kindsMod.ObjectTypeIndexerKind
import typings.astTypes.kindsMod.ObjectTypeInternalSlotKind
import typings.astTypes.kindsMod.ObjectTypePropertyKind
import typings.astTypes.kindsMod.ObjectTypeSpreadPropertyKind
import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallProperties extends js.Object {
  
  var callProperties: js.UndefOr[js.Array[ObjectTypeCallPropertyKind]] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var exact: js.UndefOr[Boolean] = js.native
  
  var indexers: js.UndefOr[js.Array[ObjectTypeIndexerKind]] = js.native
  
  var inexact: js.UndefOr[Boolean] = js.native
  
  var internalSlots: js.UndefOr[js.Array[ObjectTypeInternalSlotKind]] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind] = js.native
}
object CallProperties {
  
  @scala.inline
  def apply(properties: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): CallProperties = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallProperties]
  }
  
  @scala.inline
  implicit class CallPropertiesOps[Self <: CallProperties] (val x: Self) extends AnyVal {
    
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
    def setPropertiesVarargs(value: (ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind)*): Self = this.set("properties", js.Array(value :_*))
    
    @scala.inline
    def setProperties(value: js.Array[ObjectTypePropertyKind | ObjectTypeSpreadPropertyKind]): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallPropertiesVarargs(value: ObjectTypeCallPropertyKind*): Self = this.set("callProperties", js.Array(value :_*))
    
    @scala.inline
    def setCallProperties(value: js.Array[ObjectTypeCallPropertyKind]): Self = this.set("callProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallProperties: Self = this.set("callProperties", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setExact(value: Boolean): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setIndexersVarargs(value: ObjectTypeIndexerKind*): Self = this.set("indexers", js.Array(value :_*))
    
    @scala.inline
    def setIndexers(value: js.Array[ObjectTypeIndexerKind]): Self = this.set("indexers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexers: Self = this.set("indexers", js.undefined)
    
    @scala.inline
    def setInexact(value: Boolean): Self = this.set("inexact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInexact: Self = this.set("inexact", js.undefined)
    
    @scala.inline
    def setInternalSlotsVarargs(value: ObjectTypeInternalSlotKind*): Self = this.set("internalSlots", js.Array(value :_*))
    
    @scala.inline
    def setInternalSlots(value: js.Array[ObjectTypeInternalSlotKind]): Self = this.set("internalSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalSlots: Self = this.set("internalSlots", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
  }
}
