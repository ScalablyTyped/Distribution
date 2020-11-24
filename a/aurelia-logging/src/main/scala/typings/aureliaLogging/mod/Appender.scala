package typings.aureliaLogging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appender extends js.Object {
  
  /**
    * Appends a debug log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def debug(logger: Logger, rest: js.Any*): Unit = js.native
  
  /**
    * Appends an error log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def error(logger: Logger, rest: js.Any*): Unit = js.native
  
  /**
    * Appends an info log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def info(logger: Logger, rest: js.Any*): Unit = js.native
  
  /**
    * Appends a warning log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def warn(logger: Logger, rest: js.Any*): Unit = js.native
}
object Appender {
  
  @scala.inline
  def apply(
    debug: (Logger, /* repeated */ js.Any) => Unit,
    error: (Logger, /* repeated */ js.Any) => Unit,
    info: (Logger, /* repeated */ js.Any) => Unit,
    warn: (Logger, /* repeated */ js.Any) => Unit
  ): Appender = {
    val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), warn = js.Any.fromFunction2(warn))
    __obj.asInstanceOf[Appender]
  }
  
  @scala.inline
  implicit class AppenderOps[Self <: Appender] (val x: Self) extends AnyVal {
    
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
    def setDebug(value: (Logger, /* repeated */ js.Any) => Unit): Self = this.set("debug", js.Any.fromFunction2(value))
    
    @scala.inline
    def setError(value: (Logger, /* repeated */ js.Any) => Unit): Self = this.set("error", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInfo(value: (Logger, /* repeated */ js.Any) => Unit): Self = this.set("info", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWarn(value: (Logger, /* repeated */ js.Any) => Unit): Self = this.set("warn", js.Any.fromFunction2(value))
  }
}
