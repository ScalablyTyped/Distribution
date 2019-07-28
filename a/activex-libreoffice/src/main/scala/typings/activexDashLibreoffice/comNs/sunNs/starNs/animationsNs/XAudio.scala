package typings.activexDashLibreoffice.comNs.sunNs.starNs.animationsNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAudio extends XAnimationNode {
  /** This attribute specifies the source element that contains the audio. */
  var Source: js.Any
  var Volume: Double
}

object XAudio {
  @scala.inline
  def apply(
    Acceleration: Double,
    AutoReverse: Boolean,
    Begin: js.Any,
    Decelerate: Double,
    Duration: js.Any,
    End: js.Any,
    EndSync: js.Any,
    Fill: Double,
    FillDefault: Double,
    Parent: XInterface,
    RepeatCount: js.Any,
    RepeatDuration: js.Any,
    Restart: Double,
    RestartDefault: Double,
    Source: js.Any,
    Type: Double,
    UserData: SafeArray[NamedValue],
    Volume: Double,
    acquire: () => Unit,
    getParent: () => XInterface,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setParent: XInterface => Unit
  ): XAudio = {
    val __obj = js.Dynamic.literal(Acceleration = Acceleration, AutoReverse = AutoReverse, Begin = Begin, Decelerate = Decelerate, Duration = Duration, End = End, EndSync = EndSync, Fill = Fill, FillDefault = FillDefault, Parent = Parent, RepeatCount = RepeatCount, RepeatDuration = RepeatDuration, Restart = Restart, RestartDefault = RestartDefault, Source = Source, Type = Type, UserData = UserData, Volume = Volume, acquire = js.Any.fromFunction0(acquire), getParent = js.Any.fromFunction0(getParent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setParent = js.Any.fromFunction1(setParent))
  
    __obj.asInstanceOf[XAudio]
  }
}

