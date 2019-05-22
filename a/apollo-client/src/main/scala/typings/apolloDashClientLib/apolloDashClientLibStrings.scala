package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object apolloDashClientLibStrings {
  @js.native
  sealed trait all
    extends apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy
  
  @js.native
  sealed trait `cache-and-network`
    extends apolloDashClientLib.coreWatchQueryOptionsMod.WatchQueryFetchPolicy
  
  @js.native
  sealed trait `cache-first`
    extends apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy
  
  @js.native
  sealed trait `cache-only`
    extends apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy
  
  @js.native
  sealed trait ignore
    extends apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy
  
  @js.native
  sealed trait `network-only`
    extends apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy
  
  @js.native
  sealed trait `no-cache`
    extends apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy
  
  @js.native
  sealed trait none
    extends apolloDashClientLib.coreWatchQueryOptionsMod.ErrorPolicy
  
  @js.native
  sealed trait standby
    extends apolloDashClientLib.coreWatchQueryOptionsMod.FetchPolicy
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def `cache-and-network`: `cache-and-network` = "cache-and-network".asInstanceOf[`cache-and-network`]
  @scala.inline
  def `cache-first`: `cache-first` = "cache-first".asInstanceOf[`cache-first`]
  @scala.inline
  def `cache-only`: `cache-only` = "cache-only".asInstanceOf[`cache-only`]
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  @scala.inline
  def `network-only`: `network-only` = "network-only".asInstanceOf[`network-only`]
  @scala.inline
  def `no-cache`: `no-cache` = "no-cache".asInstanceOf[`no-cache`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def standby: standby = "standby".asInstanceOf[standby]
}

