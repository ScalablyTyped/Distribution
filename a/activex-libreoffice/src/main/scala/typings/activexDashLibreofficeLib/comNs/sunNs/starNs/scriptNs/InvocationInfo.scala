package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

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
  var PropertyAttribute: scala.Double
  /** Name of the method or property. */
  var aName: java.lang.String
  /** Mode of method parameters (IN, OUT, INOUT), for properties this sequence is empty. */
  var aParamModes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ParamMode]
  /** Types method parameters, for properties this sequence is empty */
  var aParamTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`]
  /** Type of the member, for methods the return type */
  var aType: activexDashLibreofficeLib.`type`
  /** Kind of the member (method or property). */
  var eMemberType: MemberType
}

object InvocationInfo {
  @scala.inline
  def apply(
    PropertyAttribute: scala.Double,
    aName: java.lang.String,
    aParamModes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.reflectionNs.ParamMode],
    aParamTypes: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.`type`],
    aType: activexDashLibreofficeLib.`type`,
    eMemberType: MemberType
  ): InvocationInfo = {
    val __obj = js.Dynamic.literal(PropertyAttribute = PropertyAttribute, aName = aName, aParamModes = aParamModes, aParamTypes = aParamTypes, aType = aType, eMemberType = eMemberType)
  
    __obj.asInstanceOf[InvocationInfo]
  }
}

