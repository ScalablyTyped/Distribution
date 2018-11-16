package typings
package angularDashToastyLib.toastyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IToastyService extends js.Object {
  /**
           * Create a toast with the given options and type.
           * @param options
           * @param type
           */
  def apply(options: IToastyConfig): scala.Unit = js.native
  /**
           * Create a toast with the given options and type.
           * @param options
           * @param type
           */
  def apply(options: IToastyConfig, `type`: java.lang.String): scala.Unit = js.native
  /**
           * Create a default "quick toast" with the given title.
           * @param title
           */
  def apply(title: java.lang.String): scala.Unit = js.native
  /**
           * Create a default "quick toast" with the given title.
           * @param title
           */
  def apply(title: scala.Double): scala.Unit = js.native
  /**
           * Clear toast(s).
           * @param id Optional ID to clear a specific toast.
           */
  def clear(): scala.Unit = js.native
  /**
           * Clear toast(s).
           * @param id Optional ID to clear a specific toast.
           */
  def clear(id: scala.Double): scala.Unit = js.native
  /**
           * Create a default toast with the given options.
           * @param options
           */
  def default(options: IToastyConfig): scala.Unit = js.native
  /**
           * Create a default "quick toast" with the given title.
           * @param title
           */
  def default(title: java.lang.String): scala.Unit = js.native
  /**
           * Create a default "quick toast" with the given title.
           * @param title
           */
  def default(title: scala.Double): scala.Unit = js.native
  /**
           * Create an error toast with the given options.
           * @param options
           */
  def error(options: IToastyConfig): scala.Unit = js.native
  /**
           * Create an error "quick toast" with the given title.
           * @param title
           */
  def error(title: java.lang.String): scala.Unit = js.native
  /**
           * Create an error "quick toast" with the given title.
           * @param title
           */
  def error(title: scala.Double): scala.Unit = js.native
  /**
           * Get the global config.
           */
  def getGlobalConfig(): IGlobalConfig = js.native
  /**
           * Create an info toast with the given options.
           * @param options
           */
  def info(options: IToastyConfig): scala.Unit = js.native
  /**
           * Create an info "quick toast" with the given title.
           * @param title
           */
  def info(title: java.lang.String): scala.Unit = js.native
  /**
           * Create an info "quick toast" with the given title.
           * @param title
           */
  def info(title: scala.Double): scala.Unit = js.native
  /**
           * Create a success toast with the given options.
           * @param options
           */
  def success(options: IToastyConfig): scala.Unit = js.native
  /**
           * Create a success "quick toast" with the given title.
           * @param title
           */
  def success(title: java.lang.String): scala.Unit = js.native
  /**
           * Create a success "quick toast" with the given title.
           * @param title
           */
  def success(title: scala.Double): scala.Unit = js.native
  /**
           * Create a wait toast with the given options.
           * @param options
           */
  def wait(options: IToastyConfig): scala.Unit = js.native
  /**
           * Create a wait "quick toast" with the given title.
           * @param title
           */
  def wait(title: java.lang.String): scala.Unit = js.native
  /**
           * Create a wait "quick toast" with the given title.
           * @param title
           */
  def wait(title: scala.Double): scala.Unit = js.native
  /**
           * Create a warning toast with the given options.
           * @param options
           */
  def warning(options: IToastyConfig): scala.Unit = js.native
  /**
           * Create a warning "quick toast" with the given title.
           * @param title
           */
  def warning(title: java.lang.String): scala.Unit = js.native
  /**
           * Create a warning "quick toast" with the given title.
           * @param title
           */
  def warning(title: scala.Double): scala.Unit = js.native
}

