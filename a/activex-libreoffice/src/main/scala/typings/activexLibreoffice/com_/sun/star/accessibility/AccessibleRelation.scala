package typings.activexLibreoffice.com_.sun.star.accessibility

import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An {@link AccessibleRelation} object defines a one-to-many relation.
  *
  * The represented relation points from the implementing object to a set of target objects.
  * @since OOo 1.1.2
  */
@js.native
trait AccessibleRelation extends js.Object {
  
  /**
    * Type of the relation.
    *
    * Its value has to be one of the constants defined by {@link AccessibleRelationType} . If that value is INVALID then the whole relation is regarded as
    * invalid. The content of the TargetSet is then undefined.
    * @see AccessibleRelationType
    */
  var RelationType: Double = js.native
  
  /**
    * Set of objects that are the relation's targets.
    *
    * The content of this set is undefined if the relation's type is INVALID. The set must not contain references to one object more than once.
    */
  var TargetSet: SafeArray[XInterface] = js.native
}
object AccessibleRelation {
  
  @scala.inline
  def apply(RelationType: Double, TargetSet: SafeArray[XInterface]): AccessibleRelation = {
    val __obj = js.Dynamic.literal(RelationType = RelationType.asInstanceOf[js.Any], TargetSet = TargetSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibleRelation]
  }
  
  @scala.inline
  implicit class AccessibleRelationOps[Self <: AccessibleRelation] (val x: Self) extends AnyVal {
    
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
    def setRelationType(value: Double): Self = this.set("RelationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSet(value: SafeArray[XInterface]): Self = this.set("TargetSet", value.asInstanceOf[js.Any])
  }
}
