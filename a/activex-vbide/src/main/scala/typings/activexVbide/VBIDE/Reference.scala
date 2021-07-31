package typings.activexVbide.VBIDE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference extends StObject {
  
  val BuiltIn: Boolean
  
  def Collection(index: js.Any): Reference
  @JSName("Collection")
  val Collection_Original: References
  
  val Description: String
  
  val FullPath: String
  
  val Guid: String
  
  val IsBroken: Boolean
  
  val Major: Double
  
  val Minor: Double
  
  val Name: String
  
  val Type: vbextRefKind
  
  val VBE: typings.activexVbide.VBIDE.VBE
  
  @JSName("VBIDE.Reference_typekey")
  var VBIDEDotReference_typekey: Reference
}
object Reference {
  
  @scala.inline
  def apply(
    BuiltIn: Boolean,
    Collection: References,
    Description: String,
    FullPath: String,
    Guid: String,
    IsBroken: Boolean,
    Major: Double,
    Minor: Double,
    Name: String,
    Type: vbextRefKind,
    VBE: VBE,
    VBIDEDotReference_typekey: Reference
  ): Reference = {
    val __obj = js.Dynamic.literal(BuiltIn = BuiltIn.asInstanceOf[js.Any], Collection = Collection.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], FullPath = FullPath.asInstanceOf[js.Any], Guid = Guid.asInstanceOf[js.Any], IsBroken = IsBroken.asInstanceOf[js.Any], Major = Major.asInstanceOf[js.Any], Minor = Minor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], VBE = VBE.asInstanceOf[js.Any])
    __obj.updateDynamic("VBIDE.Reference_typekey")(VBIDEDotReference_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  @scala.inline
  implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollection(value: References): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullPath(value: String): Self = StObject.set(x, "FullPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuid(value: String): Self = StObject.set(x, "Guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBroken(value: Boolean): Self = StObject.set(x, "IsBroken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: Double): Self = StObject.set(x, "Major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: Double): Self = StObject.set(x, "Minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: vbextRefKind): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBE(value: VBE): Self = StObject.set(x, "VBE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVBIDEDotReference_typekey(value: Reference): Self = StObject.set(x, "VBIDE.Reference_typekey", value.asInstanceOf[js.Any])
  }
}
