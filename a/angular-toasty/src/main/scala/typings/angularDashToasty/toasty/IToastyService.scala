package typings.angularDashToasty.toasty

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
  def apply(options: IToastyConfig): Unit = js.native
  def apply(options: IToastyConfig, `type`: String): Unit = js.native
  /**
    * Create a default "quick toast" with the given title.
    * @param title
    */
  def apply(title: String): Unit = js.native
  def apply(title: Double): Unit = js.native
  /**
    * Clear toast(s).
    * @param id Optional ID to clear a specific toast.
    */
  def clear(): Unit = js.native
  def clear(id: Double): Unit = js.native
  /**
    * Create a default toast with the given options.
    * @param options
    */
  def default(options: IToastyConfig): Unit = js.native
  /**
    * Create a default "quick toast" with the given title.
    * @param title
    */
  def default(title: String): Unit = js.native
  def default(title: Double): Unit = js.native
  /**
    * Create an error toast with the given options.
    * @param options
    */
  def error(options: IToastyConfig): Unit = js.native
  /**
    * Create an error "quick toast" with the given title.
    * @param title
    */
  def error(title: String): Unit = js.native
  def error(title: Double): Unit = js.native
  /**
    * Get the global config.
    */
  def getGlobalConfig(): IGlobalConfig = js.native
  /**
    * Create an info toast with the given options.
    * @param options
    */
  def info(options: IToastyConfig): Unit = js.native
  /**
    * Create an info "quick toast" with the given title.
    * @param title
    */
  def info(title: String): Unit = js.native
  def info(title: Double): Unit = js.native
  /**
    * Create a success toast with the given options.
    * @param options
    */
  def success(options: IToastyConfig): Unit = js.native
  /**
    * Create a success "quick toast" with the given title.
    * @param title
    */
  def success(title: String): Unit = js.native
  def success(title: Double): Unit = js.native
  /**
    * Create a wait toast with the given options.
    * @param options
    */
  def wait(options: IToastyConfig): Unit = js.native
  /**
    * Create a wait "quick toast" with the given title.
    * @param title
    */
  def wait(title: String): Unit = js.native
  def wait(title: Double): Unit = js.native
  /**
    * Create a warning toast with the given options.
    * @param options
    */
  def warning(options: IToastyConfig): Unit = js.native
  /**
    * Create a warning "quick toast" with the given title.
    * @param title
    */
  def warning(title: String): Unit = js.native
  def warning(title: Double): Unit = js.native
}

