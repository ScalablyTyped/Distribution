package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An {@link AccessibleRelation} object defines a one-to-many relation.
  *
  * The represented relation points from the implementing object to a set of target objects.
  * @since OOo 1.1.2
  */
trait AccessibleRelation extends js.Object {
  /**
    * Type of the relation.
    *
    * Its value has to be one of the constants defined by {@link AccessibleRelationType} . If that value is INVALID then the whole relation is regarded as
    * invalid. The content of the TargetSet is then undefined.
    * @see AccessibleRelationType
    */
  var RelationType: scala.Double
  /**
    * Set of objects that are the relation's targets.
    *
    * The content of this set is undefined if the relation's type is INVALID. The set must not contain references to one object more than once.
    */
  var TargetSet: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface]
}

