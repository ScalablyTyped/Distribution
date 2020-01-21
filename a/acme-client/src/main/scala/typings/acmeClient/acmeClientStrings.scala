package typings.acmeClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object acmeClientStrings {
  @js.native
  sealed trait deactivated extends js.Object
  
  @js.native
  sealed trait `dns-01` extends js.Object
  
  @js.native
  sealed trait expired extends js.Object
  
  @js.native
  sealed trait `http-01` extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait processing extends js.Object
  
  @js.native
  sealed trait ready extends js.Object
  
  @js.native
  sealed trait revoked extends js.Object
  
  @js.native
  sealed trait valid extends js.Object
  
  @scala.inline
  def deactivated: deactivated = "deactivated".asInstanceOf[deactivated]
  @scala.inline
  def `dns-01`: `dns-01` = "dns-01".asInstanceOf[`dns-01`]
  @scala.inline
  def expired: expired = "expired".asInstanceOf[expired]
  @scala.inline
  def `http-01`: `http-01` = "http-01".asInstanceOf[`http-01`]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def revoked: revoked = "revoked".asInstanceOf[revoked]
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
}

