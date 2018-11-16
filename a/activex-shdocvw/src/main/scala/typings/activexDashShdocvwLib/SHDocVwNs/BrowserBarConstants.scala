package typings
package activexDashShdocvwLib.SHDocVwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BrowserBarConstants extends js.Object

// tslint:disable-next-line no-const-enum
@JSGlobal("SHDocVw.BrowserBarConstants")
@js.native
object BrowserBarConstants extends js.Object {
  @js.native
  sealed trait AddressBar
    extends activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants
  
  @js.native
  sealed trait Channels
    extends activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants
  
  @js.native
  sealed trait Favorites
    extends activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants
  
  @js.native
  sealed trait History
    extends activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants
  
  @js.native
  sealed trait Links
    extends activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants
  
  @js.native
  sealed trait Search
    extends activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants
  
  @js.native
  sealed trait Tools
    extends activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants
  
  /* 0x0009 */ val AddressBar: AddressBar with scala.Double = js.native
  /* "{EFA24E63-B078-11D0-89E4-00C04FC9E26E}" */ val Channels: Channels with scala.Double = js.native
  /* "{EFA24E61-B078-11D0-89E4-00C04FC9E26E}" */ val Favorites: Favorites with scala.Double = js.native
  /* "{EFA24E62-B078-11D0-89E4-00C04FC9E26E}" */ val History: History with scala.Double = js.native
  /* 0x000B */ val Links: Links with scala.Double = js.native
  /* "{30D02401-6A81-11D0-8274-00C04FD5AE38}" */ val Search: Search with scala.Double = js.native
  /* 0x000A */ val Tools: Tools with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashShdocvwLib.SHDocVwNs.BrowserBarConstants with scala.Double] = js.native
}

