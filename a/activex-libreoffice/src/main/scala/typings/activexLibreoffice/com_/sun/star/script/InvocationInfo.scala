package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.reflection.ParamMode
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This struct is used to specify information about object members (methods or properties) accessed via {@link XInvocation} , such as names, types, or
  * parameters.
  */
trait InvocationInfo extends StObject {
  
  /**
    * Only for property members: This field may contain zero or more constants of the {@link com.sun.star.beans.PropertyAttribute} constants group. It is
    * not guaranteed that all necessary constants are set to describe the property completely, but a flag will only be set, if the corresponding charac-
    * teristic really exists. Example: If the READONLY flag is set, the property is readonly. If it isn't set, the property nevertheless can be readonly.
    *
    * For methods this field is irrelevant and is set to 0.
    */
  var PropertyAttribute: Double
  
  /** Name of the method or property. */
  var aName: String
  
  /** Mode of method parameters (IN, OUT, INOUT), for properties this sequence is empty. */
  var aParamModes: SafeArray[ParamMode]
  
  /** Types method parameters, for properties this sequence is empty */
  var aParamTypes: SafeArray[`type`]
  
  /** Type of the member, for methods the return type */
  var aType: `type`
  
  /** Kind of the member (method or property). */
  var eMemberType: MemberType
}
object InvocationInfo {
  
  @scala.inline
  def apply(
    PropertyAttribute: Double,
    aName: String,
    aParamModes: SafeArray[ParamMode],
    aParamTypes: SafeArray[`type`],
    aType: `type`,
    eMemberType: MemberType
  ): InvocationInfo = {
    val __obj = js.Dynamic.literal(PropertyAttribute = PropertyAttribute.asInstanceOf[js.Any], aName = aName.asInstanceOf[js.Any], aParamModes = aParamModes.asInstanceOf[js.Any], aParamTypes = aParamTypes.asInstanceOf[js.Any], aType = aType.asInstanceOf[js.Any], eMemberType = eMemberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvocationInfo]
  }
  
  @scala.inline
  implicit class InvocationInfoMutableBuilder[Self <: InvocationInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAName(value: String): Self = StObject.set(x, "aName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAParamModes(value: SafeArray[ParamMode]): Self = StObject.set(x, "aParamModes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAParamTypes(value: SafeArray[`type`]): Self = StObject.set(x, "aParamTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAType(value: `type`): Self = StObject.set(x, "aType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEMemberType(value: MemberType): Self = StObject.set(x, "eMemberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyAttribute(value: Double): Self = StObject.set(x, "PropertyAttribute", value.asInstanceOf[js.Any])
  }
}
