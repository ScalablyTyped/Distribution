package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An array of {@link InstanceForm} objects.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.EntityArrayCollection<InstanceForm> * / any */ @js.native
trait InstanceFormArray extends js.Object {
  
  def CHILD_TAG(): String = js.native
  
  def TAG(): String = js.native
  
  def createChild(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): InstanceForm = js.native
  
  /**
    * Convert {@link InstanceForm} objects to {@link InstanceArray}.
    *
    * @return An array of instance containing repeated instances in {@link InstanceForm} objects.
    */
  def toInstanceArray(): InstanceArray = js.native
}
object InstanceFormArray {
  
  @scala.inline
  def apply(
    CHILD_TAG: () => String,
    TAG: () => String,
    createChild: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => InstanceForm,
    toInstanceArray: () => InstanceArray
  ): InstanceFormArray = {
    val __obj = js.Dynamic.literal(CHILD_TAG = js.Any.fromFunction0(CHILD_TAG), TAG = js.Any.fromFunction0(TAG), createChild = js.Any.fromFunction1(createChild), toInstanceArray = js.Any.fromFunction0(toInstanceArray))
    __obj.asInstanceOf[InstanceFormArray]
  }
  
  @scala.inline
  implicit class InstanceFormArrayOps[Self <: InstanceFormArray] (val x: Self) extends AnyVal {
    
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
    def setCHILD_TAG(value: () => String): Self = this.set("CHILD_TAG", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTAG(value: () => String): Self = this.set("TAG", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateChild(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => InstanceForm
    ): Self = this.set("createChild", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToInstanceArray(value: () => InstanceArray): Self = this.set("toInstanceArray", js.Any.fromFunction0(value))
  }
}
