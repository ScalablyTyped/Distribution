package typings.`3dBinPacking`.bws.packer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Bridge of {@link Packer} for {@link InstanceForm repeated instances}.
  *
  * @author Jeongho Nam <http://samchon.org>
  */
/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify protocol.Entity * / any */ @js.native
trait PackerForm extends js.Object {
  
  def TAG(): String = js.native
  
  def construct(
    xml: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any
  ): Unit = js.native
  
  def getInstanceFormArray(): InstanceFormArray = js.native
  
  def getWrapperArray(): WrapperArray = js.native
  
  /**
    * Form of Instances to pack.
    */
  var instanceFormArray: js.Any = js.native
  
  def optimize(): WrapperArray = js.native
  
  def toPacker(): Packer = js.native
  
  def toXML(): js.Any = js.native
  
  /**
    * Type of Wrappers to be used.
    */
  var wrapperArray: js.Any = js.native
}
object PackerForm {
  
  @scala.inline
  def apply(
    TAG: () => String,
    construct: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit,
    getInstanceFormArray: () => InstanceFormArray,
    getWrapperArray: () => WrapperArray,
    instanceFormArray: js.Any,
    optimize: () => WrapperArray,
    toPacker: () => Packer,
    toXML: () => js.Any,
    wrapperArray: js.Any
  ): PackerForm = {
    val __obj = js.Dynamic.literal(TAG = js.Any.fromFunction0(TAG), construct = js.Any.fromFunction1(construct), getInstanceFormArray = js.Any.fromFunction0(getInstanceFormArray), getWrapperArray = js.Any.fromFunction0(getWrapperArray), instanceFormArray = instanceFormArray.asInstanceOf[js.Any], optimize = js.Any.fromFunction0(optimize), toPacker = js.Any.fromFunction0(toPacker), toXML = js.Any.fromFunction0(toXML), wrapperArray = wrapperArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackerForm]
  }
  
  @scala.inline
  implicit class PackerFormOps[Self <: PackerForm] (val x: Self) extends AnyVal {
    
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
    def setTAG(value: () => String): Self = this.set("TAG", js.Any.fromFunction0(value))
    
    @scala.inline
    def setConstruct(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify library.XML */ js.Any => Unit
    ): Self = this.set("construct", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetInstanceFormArray(value: () => InstanceFormArray): Self = this.set("getInstanceFormArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWrapperArray(value: () => WrapperArray): Self = this.set("getWrapperArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstanceFormArray(value: js.Any): Self = this.set("instanceFormArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptimize(value: () => WrapperArray): Self = this.set("optimize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToPacker(value: () => Packer): Self = this.set("toPacker", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToXML(value: () => js.Any): Self = this.set("toXML", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWrapperArray(value: js.Any): Self = this.set("wrapperArray", value.asInstanceOf[js.Any])
  }
}
