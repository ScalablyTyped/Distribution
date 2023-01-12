package typings.activexWia.WIA

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Property object is a container for a property associated with a Device, DeviceInfo, Filter, ImageFile or Item object. See the Properties property
  * on any of these objects for details on accessing Property objects.
  */
trait Property extends StObject {
  
  /** Indicates whether the Property Value is read only */
  val IsReadOnly: Boolean
  
  /** Indicates whether the Property Value is a vector */
  val IsVector: Boolean
  
  /** Returns the Property Name */
  val Name: String
  
  /** Returns the PropertyID of this Property */
  val PropertyID: Double
  
  /** Returns the SubType of the Property, if any */
  val SubType: WiaSubType
  
  /** Returns the default Property Value if the SubType is not UnspecifiedSubType */
  val SubTypeDefault: Any
  
  /** Returns the maximum valid Property Value if the SubType is RangeSubType */
  val SubTypeMax: Double
  
  /** Returns the minimum valid Property Value if the SubType is RangeSubType */
  val SubTypeMin: Double
  
  /** Returns the step increment of Property Values if the SubType is RangeSubType */
  val SubTypeStep: Double
  
  /** Returns the specified item in the vector by position */
  /** Returns a Vector of valid Property Values if the SubType is ListSubType or valid flag Values that can be ored together if the SubType is FlagSubType */
  def SubTypeValues(Index: Double): Any
  /** Returns a Vector of valid Property Values if the SubType is ListSubType or valid flag Values that can be ored together if the SubType is FlagSubType */
  @JSName("SubTypeValues")
  val SubTypeValues_Original: Vector[Any]
  
  /** Returns either a WiaPropertyType or a WiaImagePropertyType */
  val Type: Double
  
  /** Returns/Sets the Property Value */
  var Value: Any
  
  /* private */ @JSName("WIA.Property_typekey")
  var WIADotProperty_typekey: Property
}
object Property {
  
  inline def apply(
    IsReadOnly: Boolean,
    IsVector: Boolean,
    Name: String,
    PropertyID: Double,
    SubType: WiaSubType,
    SubTypeDefault: Any,
    SubTypeMax: Double,
    SubTypeMin: Double,
    SubTypeStep: Double,
    SubTypeValues: Vector[Any],
    Type: Double,
    Value: Any,
    WIADotProperty_typekey: Property
  ): Property = {
    val __obj = js.Dynamic.literal(IsReadOnly = IsReadOnly.asInstanceOf[js.Any], IsVector = IsVector.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PropertyID = PropertyID.asInstanceOf[js.Any], SubType = SubType.asInstanceOf[js.Any], SubTypeDefault = SubTypeDefault.asInstanceOf[js.Any], SubTypeMax = SubTypeMax.asInstanceOf[js.Any], SubTypeMin = SubTypeMin.asInstanceOf[js.Any], SubTypeStep = SubTypeStep.asInstanceOf[js.Any], SubTypeValues = SubTypeValues.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("WIA.Property_typekey")(WIADotProperty_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Property]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Property] (val x: Self) extends AnyVal {
    
    inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "IsReadOnly", value.asInstanceOf[js.Any])
    
    inline def setIsVector(value: Boolean): Self = StObject.set(x, "IsVector", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPropertyID(value: Double): Self = StObject.set(x, "PropertyID", value.asInstanceOf[js.Any])
    
    inline def setSubType(value: WiaSubType): Self = StObject.set(x, "SubType", value.asInstanceOf[js.Any])
    
    inline def setSubTypeDefault(value: Any): Self = StObject.set(x, "SubTypeDefault", value.asInstanceOf[js.Any])
    
    inline def setSubTypeMax(value: Double): Self = StObject.set(x, "SubTypeMax", value.asInstanceOf[js.Any])
    
    inline def setSubTypeMin(value: Double): Self = StObject.set(x, "SubTypeMin", value.asInstanceOf[js.Any])
    
    inline def setSubTypeStep(value: Double): Self = StObject.set(x, "SubTypeStep", value.asInstanceOf[js.Any])
    
    inline def setSubTypeValues(value: Vector[Any]): Self = StObject.set(x, "SubTypeValues", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setWIADotProperty_typekey(value: Property): Self = StObject.set(x, "WIA.Property_typekey", value.asInstanceOf[js.Any])
  }
}
