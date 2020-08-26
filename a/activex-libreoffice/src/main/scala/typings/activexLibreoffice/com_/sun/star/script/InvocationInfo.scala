package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.reflection.ParamMode
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct is used to specify information about object members (methods or properties) accessed via {@link XInvocation} , such as names, types, or
  * parameters.
  */
@js.native
trait InvocationInfo extends js.Object {
  /**
    * Only for property members: This field may contain zero or more constants of the {@link com.sun.star.beans.PropertyAttribute} constants group. It is
    * not guaranteed that all necessary constants are set to describe the property completely, but a flag will only be set, if the corresponding charac-
    * teristic really exists. Example: If the READONLY flag is set, the property is readonly. If it isn't set, the property nevertheless can be readonly.
    *
    * For methods this field is irrelevant and is set to 0.
    */
  var PropertyAttribute: Double = js.native
  /** Name of the method or property. */
  var aName: String = js.native
  /** Mode of method parameters (IN, OUT, INOUT), for properties this sequence is empty. */
  var aParamModes: SafeArray[ParamMode] = js.native
  /** Types method parameters, for properties this sequence is empty */
  var aParamTypes: SafeArray[`type`] = js.native
  /** Type of the member, for methods the return type */
  var aType: `type` = js.native
  /** Kind of the member (method or property). */
  var eMemberType: MemberType = js.native
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
  implicit class InvocationInfoOps[Self <: InvocationInfo] (val x: Self) extends AnyVal {
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
    def setPropertyAttribute(value: Double): Self = this.set("PropertyAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setAName(value: String): Self = this.set("aName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAParamModes(value: SafeArray[ParamMode]): Self = this.set("aParamModes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAParamTypes(value: SafeArray[`type`]): Self = this.set("aParamTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def setAType(value: `type`): Self = this.set("aType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEMemberType(value: MemberType): Self = this.set("eMemberType", value.asInstanceOf[js.Any])
  }
  
}

