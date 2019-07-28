package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.reflectionNs.ParamMode
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct is used to specify information about object members (methods or properties) accessed via {@link XInvocation} , such as names, types, or
  * parameters.
  */
trait InvocationInfo extends js.Object {
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
    val __obj = js.Dynamic.literal(PropertyAttribute = PropertyAttribute, aName = aName, aParamModes = aParamModes, aParamTypes = aParamTypes, aType = aType, eMemberType = eMemberType)
  
    __obj.asInstanceOf[InvocationInfo]
  }
}

