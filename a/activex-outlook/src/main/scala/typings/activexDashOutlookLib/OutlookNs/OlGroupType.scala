package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlGroupType extends js.Object

@JSGlobal("Outlook.OlGroupType")
@js.native
object OlGroupType extends js.Object {
  @js.native
  sealed trait olCustomFoldersGroup
    extends activexDashOutlookLib.OutlookNs.OlGroupType
  
  @js.native
  sealed trait olFavoriteFoldersGroup
    extends activexDashOutlookLib.OutlookNs.OlGroupType
  
  @js.native
  sealed trait olMyFoldersGroup
    extends activexDashOutlookLib.OutlookNs.OlGroupType
  
  @js.native
  sealed trait olOtherFoldersGroup
    extends activexDashOutlookLib.OutlookNs.OlGroupType
  
  @js.native
  sealed trait olPeopleFoldersGroup
    extends activexDashOutlookLib.OutlookNs.OlGroupType
  
  @js.native
  sealed trait olReadOnlyGroup
    extends activexDashOutlookLib.OutlookNs.OlGroupType
  
  @js.native
  sealed trait olRoomsGroup
    extends activexDashOutlookLib.OutlookNs.OlGroupType
  
  /* 0 */ val olCustomFoldersGroup: olCustomFoldersGroup with scala.Double = js.native
  /* 4 */ val olFavoriteFoldersGroup: olFavoriteFoldersGroup with scala.Double = js.native
  /* 1 */ val olMyFoldersGroup: olMyFoldersGroup with scala.Double = js.native
  /* 3 */ val olOtherFoldersGroup: olOtherFoldersGroup with scala.Double = js.native
  /* 2 */ val olPeopleFoldersGroup: olPeopleFoldersGroup with scala.Double = js.native
  /* 6 */ val olReadOnlyGroup: olReadOnlyGroup with scala.Double = js.native
  /* 5 */ val olRoomsGroup: olRoomsGroup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlGroupType with scala.Double] = js.native
}

