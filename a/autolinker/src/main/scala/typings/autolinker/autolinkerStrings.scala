package typings.autolinker

import typings.autolinker.autolinkerMod.HashtagConfig
import typings.autolinker.autolinkerMod.HashtagServices
import typings.autolinker.autolinkerMod.MentionConfig
import typings.autolinker.autolinkerMod.MentionServices
import typings.autolinker.autolinkerMod.UrlMatchTypeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autolinkerStrings {
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait facebook
    extends HashtagConfig
       with HashtagServices
  @scala.inline
  def facebook: facebook = "facebook".asInstanceOf[facebook]
  
  @js.native
  sealed trait instagram
    extends HashtagConfig
       with HashtagServices
       with MentionConfig
       with MentionServices
  @scala.inline
  def instagram: instagram = "instagram".asInstanceOf[instagram]
  
  @js.native
  sealed trait middle extends StObject
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait scheme extends UrlMatchTypeOptions
  @scala.inline
  def scheme: scheme = "scheme".asInstanceOf[scheme]
  
  @js.native
  sealed trait smart extends StObject
  @scala.inline
  def smart: smart = "smart".asInstanceOf[smart]
  
  @js.native
  sealed trait soundcloud
    extends MentionConfig
       with MentionServices
  @scala.inline
  def soundcloud: soundcloud = "soundcloud".asInstanceOf[soundcloud]
  
  @js.native
  sealed trait tld extends UrlMatchTypeOptions
  @scala.inline
  def tld: tld = "tld".asInstanceOf[tld]
  
  @js.native
  sealed trait twitter
    extends HashtagConfig
       with HashtagServices
       with MentionConfig
       with MentionServices
  @scala.inline
  def twitter: twitter = "twitter".asInstanceOf[twitter]
  
  @js.native
  sealed trait www extends UrlMatchTypeOptions
  @scala.inline
  def www: www = "www".asInstanceOf[www]
}
