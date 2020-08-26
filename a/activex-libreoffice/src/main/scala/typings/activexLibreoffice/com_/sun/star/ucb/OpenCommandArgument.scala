package typings.activexLibreoffice.com_.sun.star.ucb

import typings.activexLibreoffice.com_.sun.star.beans.Property
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The argument for commands like "open", "update", and "synchronize".
  * @see XCommandProcessor
  */
@js.native
trait OpenCommandArgument extends js.Object {
  /**
    * A mode.
    *
    * The value can be one of the {@link OpenMode} constants.
    */
  var Mode: Double = js.native
  /** The command's priority, in the range `0` (highest) to `65535` (lowest). */
  var Priority: Double = js.native
  /** The properties, for that the values shall be provided by the {@link DynamicResultSet} returned by the command). */
  var Properties: SafeArray[Property] = js.native
  /**
    * The data sink to write the contents into (supporting either {@link com.sun.star.io.XActiveDataSink} , {@link com.sun.star.io.XOutputStream} or {@link
    * com.sun.star.io.XActiveDataStreamer} ).
    *
    * XActiveDataSink and XOutputStream give the caller read-only access to the contents. XActiveDataStreamer offers both read and write access to the
    * contents.
    *
    * If an XActiveDataSink is supplied, the implementation of the command needs to provide an implementation of an object implementing the interface {@link
    * com.sun.star.io.XInputStream} . It is highly recommended that this object also implements the interface {@link com.sun.star.io.XSeekable} , if this
    * can be done without wasting resources (i.e. allocating huge memory buffers). The implementation object has to be supplied to the data sink.
    */
  var Sink: XInterface = js.native
}

object OpenCommandArgument {
  @scala.inline
  def apply(Mode: Double, Priority: Double, Properties: SafeArray[Property], Sink: XInterface): OpenCommandArgument = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], Priority = Priority.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Sink = Sink.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenCommandArgument]
  }
  @scala.inline
  implicit class OpenCommandArgumentOps[Self <: OpenCommandArgument] (val x: Self) extends AnyVal {
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
    def setMode(value: Double): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setPriority(value: Double): Self = this.set("Priority", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: SafeArray[Property]): Self = this.set("Properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSink(value: XInterface): Self = this.set("Sink", value.asInstanceOf[js.Any])
  }
  
}

