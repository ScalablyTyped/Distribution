package typings.antvScale

import typings.antvScale.typesMod.ScaleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object antvScaleStrings {
  @js.native
  sealed trait base
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @js.native
  sealed trait cat
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @js.native
  sealed trait identity
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @js.native
  sealed trait linear
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @js.native
  sealed trait log
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @js.native
  sealed trait pow
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @js.native
  sealed trait time
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @js.native
  sealed trait timeCat
    extends ScaleType
       with typings.antvScale.libTypesMod.ScaleType
  
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  @scala.inline
  def cat: cat = "cat".asInstanceOf[cat]
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  @scala.inline
  def pow: pow = "pow".asInstanceOf[pow]
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  @scala.inline
  def timeCat: timeCat = "timeCat".asInstanceOf[timeCat]
}

