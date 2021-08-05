package typings.activexAccess.Access

import typings.activexVbide.VBIDE.vbextRefKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reference extends StObject {
  
  /* private */ @JSName("Access.Reference_typekey")
  var AccessDotReference_typekey: Reference
  
  val BuiltIn: Boolean
  
  def Collection(var_0: String): Reference
  def Collection(var_0: Double): Reference
  @JSName("Collection")
  val Collection_Original: References
  
  val FullPath: String
  
  val Guid: String
  
  val IsBroken: Boolean
  
  def IsMemberSafe(dispid: Double): Boolean
  
  val Kind: vbextRefKind
  
  val Major: Double
  
  val Minor: Double
  
  val Name: String
}
object Reference {
  
  inline def apply(
    AccessDotReference_typekey: Reference,
    BuiltIn: Boolean,
    Collection: References,
    FullPath: String,
    Guid: String,
    IsBroken: Boolean,
    IsMemberSafe: Double => Boolean,
    Kind: vbextRefKind,
    Major: Double,
    Minor: Double,
    Name: String
  ): Reference = {
    val __obj = js.Dynamic.literal(BuiltIn = BuiltIn.asInstanceOf[js.Any], Collection = Collection.asInstanceOf[js.Any], FullPath = FullPath.asInstanceOf[js.Any], Guid = Guid.asInstanceOf[js.Any], IsBroken = IsBroken.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Kind = Kind.asInstanceOf[js.Any], Major = Major.asInstanceOf[js.Any], Minor = Minor.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.Reference_typekey")(AccessDotReference_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reference]
  }
  
  extension [Self <: Reference](x: Self) {
    
    inline def setAccessDotReference_typekey(value: Reference): Self = StObject.set(x, "Access.Reference_typekey", value.asInstanceOf[js.Any])
    
    inline def setBuiltIn(value: Boolean): Self = StObject.set(x, "BuiltIn", value.asInstanceOf[js.Any])
    
    inline def setCollection(value: References): Self = StObject.set(x, "Collection", value.asInstanceOf[js.Any])
    
    inline def setFullPath(value: String): Self = StObject.set(x, "FullPath", value.asInstanceOf[js.Any])
    
    inline def setGuid(value: String): Self = StObject.set(x, "Guid", value.asInstanceOf[js.Any])
    
    inline def setIsBroken(value: Boolean): Self = StObject.set(x, "IsBroken", value.asInstanceOf[js.Any])
    
    inline def setIsMemberSafe(value: Double => Boolean): Self = StObject.set(x, "IsMemberSafe", js.Any.fromFunction1(value))
    
    inline def setKind(value: vbextRefKind): Self = StObject.set(x, "Kind", value.asInstanceOf[js.Any])
    
    inline def setMajor(value: Double): Self = StObject.set(x, "Major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: Double): Self = StObject.set(x, "Minor", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
