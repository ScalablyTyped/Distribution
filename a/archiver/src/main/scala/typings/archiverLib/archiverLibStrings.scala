package typings
package archiverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object archiverLibStrings {
  @js.native
  sealed trait close extends js.Object
  
  @js.native
  sealed trait data extends js.Object
  
  @js.native
  sealed trait drain extends js.Object
  
  @js.native
  sealed trait entry extends js.Object
  
  @js.native
  sealed trait error extends js.Object
  
  @js.native
  sealed trait finish extends js.Object
  
  @js.native
  sealed trait pipe extends js.Object
  
  @js.native
  sealed trait progress extends js.Object
  
  @js.native
  sealed trait tar
    extends archiverLib.archiverMod.Format
  
  @js.native
  sealed trait unpipe extends js.Object
  
  @js.native
  sealed trait warning extends js.Object
  
  @js.native
  sealed trait zip
    extends archiverLib.archiverMod.Format
  
  @scala.inline
  def close: close = "close".asInstanceOf[close]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def drain: drain = "drain".asInstanceOf[drain]
  @scala.inline
  def entry: entry = "entry".asInstanceOf[entry]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def finish: finish = "finish".asInstanceOf[finish]
  @scala.inline
  def pipe: pipe = "pipe".asInstanceOf[pipe]
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def tar: tar = "tar".asInstanceOf[tar]
  @scala.inline
  def unpipe: unpipe = "unpipe".asInstanceOf[unpipe]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
  @scala.inline
  def zip: zip = "zip".asInstanceOf[zip]
}

