package typings.ably

import typings.ably.ablyMod.Types.DevicePushState
import typings.ably.ablyMod.Types.Transport
import typings.ably.ablyMod.Types.capabilityOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ablyStrings {
  @js.native
  sealed trait ACTIVE extends DevicePushState
  
  @js.native
  sealed trait FAILED extends DevicePushState
  
  @js.native
  sealed trait FAILING extends DevicePushState
  
  @js.native
  sealed trait GET extends js.Object
  
  @js.native
  sealed trait POST extends js.Object
  
  @js.native
  sealed trait absent extends js.Object
  
  @js.native
  sealed trait android extends js.Object
  
  @js.native
  sealed trait attached extends js.Object
  
  @js.native
  sealed trait attaching extends js.Object
  
  @js.native
  sealed trait browser extends js.Object
  
  @js.native
  sealed trait car extends js.Object
  
  @js.native
  sealed trait `channel-metadata` extends capabilityOp
  
  @js.native
  sealed trait closed extends js.Object
  
  @js.native
  sealed trait closing extends js.Object
  
  @js.native
  sealed trait comet extends Transport
  
  @js.native
  sealed trait connected extends js.Object
  
  @js.native
  sealed trait connecting extends js.Object
  
  @js.native
  sealed trait day extends js.Object
  
  @js.native
  sealed trait desktop extends js.Object
  
  @js.native
  sealed trait detached extends js.Object
  
  @js.native
  sealed trait detaching extends js.Object
  
  @js.native
  sealed trait disconnected extends js.Object
  
  @js.native
  sealed trait embedded extends js.Object
  
  @js.native
  sealed trait enter extends js.Object
  
  @js.native
  sealed trait failed_ extends js.Object
  
  @js.native
  sealed trait history extends capabilityOp
  
  @js.native
  sealed trait hour extends js.Object
  
  @js.native
  sealed trait initialized extends js.Object
  
  @js.native
  sealed trait ios extends js.Object
  
  @js.native
  sealed trait jsonp extends Transport
  
  @js.native
  sealed trait leave extends js.Object
  
  @js.native
  sealed trait minute extends js.Object
  
  @js.native
  sealed trait month extends js.Object
  
  @js.native
  sealed trait other extends js.Object
  
  @js.native
  sealed trait phone extends js.Object
  
  @js.native
  sealed trait presence extends capabilityOp
  
  @js.native
  sealed trait present extends js.Object
  
  @js.native
  sealed trait publish extends capabilityOp
  
  @js.native
  sealed trait `push-admin` extends capabilityOp
  
  @js.native
  sealed trait `push-subscribe` extends capabilityOp
  
  @js.native
  sealed trait stats extends capabilityOp
  
  @js.native
  sealed trait subscribe extends capabilityOp
  
  @js.native
  sealed trait suspended extends js.Object
  
  @js.native
  sealed trait tablet extends js.Object
  
  @js.native
  sealed trait tv extends js.Object
  
  @js.native
  sealed trait update extends js.Object
  
  @js.native
  sealed trait watch extends js.Object
  
  @js.native
  sealed trait web_socket extends Transport
  
  @js.native
  sealed trait xhr_polling extends Transport
  
  @js.native
  sealed trait xhr_streaming extends Transport
  
  @scala.inline
  def ACTIVE: ACTIVE = "ACTIVE".asInstanceOf[ACTIVE]
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def FAILING: FAILING = "FAILING".asInstanceOf[FAILING]
  @scala.inline
  def GET: GET = "GET".asInstanceOf[GET]
  @scala.inline
  def POST: POST = "POST".asInstanceOf[POST]
  @scala.inline
  def absent: absent = "absent".asInstanceOf[absent]
  @scala.inline
  def android: android = "android".asInstanceOf[android]
  @scala.inline
  def attached: attached = "attached".asInstanceOf[attached]
  @scala.inline
  def attaching: attaching = "attaching".asInstanceOf[attaching]
  @scala.inline
  def browser: browser = "browser".asInstanceOf[browser]
  @scala.inline
  def car: car = "car".asInstanceOf[car]
  @scala.inline
  def `channel-metadata`: `channel-metadata` = "channel-metadata".asInstanceOf[`channel-metadata`]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def closing: closing = "closing".asInstanceOf[closing]
  @scala.inline
  def comet: comet = "comet".asInstanceOf[comet]
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def desktop: desktop = "desktop".asInstanceOf[desktop]
  @scala.inline
  def detached: detached = "detached".asInstanceOf[detached]
  @scala.inline
  def detaching: detaching = "detaching".asInstanceOf[detaching]
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  @scala.inline
  def embedded: embedded = "embedded".asInstanceOf[embedded]
  @scala.inline
  def enter: enter = "enter".asInstanceOf[enter]
  @scala.inline
  def failed_ : failed_ = "failed".asInstanceOf[failed_]
  @scala.inline
  def history: history = "history".asInstanceOf[history]
  @scala.inline
  def hour: hour = "hour".asInstanceOf[hour]
  @scala.inline
  def initialized: initialized = "initialized".asInstanceOf[initialized]
  @scala.inline
  def ios: ios = "ios".asInstanceOf[ios]
  @scala.inline
  def jsonp: jsonp = "jsonp".asInstanceOf[jsonp]
  @scala.inline
  def leave: leave = "leave".asInstanceOf[leave]
  @scala.inline
  def minute: minute = "minute".asInstanceOf[minute]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def phone: phone = "phone".asInstanceOf[phone]
  @scala.inline
  def presence: presence = "presence".asInstanceOf[presence]
  @scala.inline
  def present: present = "present".asInstanceOf[present]
  @scala.inline
  def publish: publish = "publish".asInstanceOf[publish]
  @scala.inline
  def `push-admin`: `push-admin` = "push-admin".asInstanceOf[`push-admin`]
  @scala.inline
  def `push-subscribe`: `push-subscribe` = "push-subscribe".asInstanceOf[`push-subscribe`]
  @scala.inline
  def stats: stats = "stats".asInstanceOf[stats]
  @scala.inline
  def subscribe: subscribe = "subscribe".asInstanceOf[subscribe]
  @scala.inline
  def suspended: suspended = "suspended".asInstanceOf[suspended]
  @scala.inline
  def tablet: tablet = "tablet".asInstanceOf[tablet]
  @scala.inline
  def tv: tv = "tv".asInstanceOf[tv]
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  @scala.inline
  def watch: watch = "watch".asInstanceOf[watch]
  @scala.inline
  def web_socket: web_socket = "web_socket".asInstanceOf[web_socket]
  @scala.inline
  def xhr_polling: xhr_polling = "xhr_polling".asInstanceOf[xhr_polling]
  @scala.inline
  def xhr_streaming: xhr_streaming = "xhr_streaming".asInstanceOf[xhr_streaming]
}

