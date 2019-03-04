package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.animationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAudio extends XAnimationNode {
  /** This attribute specifies the source element that contains the audio. */
  var Source: js.Any
  var Volume: scala.Double
}

object XAudio {
  @scala.inline
  def apply(
    Acceleration: scala.Double,
    AutoReverse: scala.Boolean,
    Begin: js.Any,
    Decelerate: scala.Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: scala.Double,
    FillDefault: scala.Double,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: scala.Double,
    RestartDefault: scala.Double,
    Source: js.Any,
    Type: scala.Double,
    UserData: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    Volume: scala.Double,
    acquire: js.Function0[scala.Unit],
    getParent: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setParent: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface, scala.Unit]
  ): XAudio = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, AutoReverse = AutoReverse, Begin = Begin, Decelerate = Decelerate, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, Source = Source, Type = Type, UserData = UserData, Volume = Volume, acquire = acquire, getParent = getParent, queryInterface = queryInterface, release = release, setParent = setParent)
  
    __obj.asInstanceOf[XAudio]
  }
}

