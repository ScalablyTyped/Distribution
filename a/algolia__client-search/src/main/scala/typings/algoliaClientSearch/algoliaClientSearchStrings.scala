package typings.algoliaClientSearch

import typings.algoliaClientSearch.mod.ApiKeyACLType
import typings.algoliaClientSearch.mod.BatchActionType
import typings.algoliaClientSearch.mod.ScopeType
import typings.algoliaClientSearch.mod.StrategyType
import typings.algoliaClientSearch.mod.SynonymType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object algoliaClientSearchStrings {
  @js.native
  sealed trait CreateIndex extends js.Object
  
  @js.native
  sealed trait addObject
    extends ApiKeyACLType
       with BatchActionType
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait allOptional extends js.Object
  
  @js.native
  sealed trait alpha extends js.Object
  
  @js.native
  sealed trait altCorrection1 extends SynonymType
  
  @js.native
  sealed trait altCorrection2 extends SynonymType
  
  @js.native
  sealed trait analytics extends ApiKeyACLType
  
  @js.native
  sealed trait attribute extends js.Object
  
  @js.native
  sealed trait browse extends ApiKeyACLType
  
  @js.native
  sealed trait contains extends js.Object
  
  @js.native
  sealed trait count extends js.Object
  
  @js.native
  sealed trait deleteIndex extends ApiKeyACLType
  
  @js.native
  sealed trait deleteObject
    extends ApiKeyACLType
       with BatchActionType
  
  @js.native
  sealed trait editSettings extends ApiKeyACLType
  
  @js.native
  sealed trait endsWith extends js.Object
  
  @js.native
  sealed trait exactPhrase extends js.Object
  
  @js.native
  sealed trait excludeWords extends js.Object
  
  @js.native
  sealed trait firstWords extends js.Object
  
  @js.native
  sealed trait ignorePlurals extends js.Object
  
  @js.native
  sealed trait is extends js.Object
  
  @js.native
  sealed trait lastWords extends js.Object
  
  @js.native
  sealed trait listIndexes extends ApiKeyACLType
  
  @js.native
  sealed trait logs extends ApiKeyACLType
  
  @js.native
  sealed trait min extends js.Object
  
  @js.native
  sealed trait multiWordsSynonym extends js.Object
  
  @js.native
  sealed trait none extends StrategyType
  
  @js.native
  sealed trait oneWaySynonym extends SynonymType
  
  @js.native
  sealed trait partialUpdateObject extends BatchActionType
  
  @js.native
  sealed trait partialUpdateObjectNoCreate extends BatchActionType
  
  @js.native
  sealed trait placeholder extends SynonymType
  
  @js.native
  sealed trait prefixAll extends js.Object
  
  @js.native
  sealed trait prefixLast extends js.Object
  
  @js.native
  sealed trait prefixNone extends js.Object
  
  @js.native
  sealed trait recommendation extends ApiKeyACLType
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait rules extends ScopeType
  
  @js.native
  sealed trait search extends ApiKeyACLType
  
  @js.native
  sealed trait seeUnretrievableAttributes extends ApiKeyACLType
  
  @js.native
  sealed trait settings
    extends ApiKeyACLType
       with ScopeType
  
  @js.native
  sealed trait singleWordSynonym extends js.Object
  
  @js.native
  sealed trait startsWith extends js.Object
  
  @js.native
  sealed trait stopIfEnoughMatches extends StrategyType
  
  @js.native
  sealed trait strict extends js.Object
  
  @js.native
  sealed trait synonym extends SynonymType
  
  @js.native
  sealed trait synonyms extends ScopeType
  
  @js.native
  sealed trait updateObject extends BatchActionType
  
  @js.native
  sealed trait usage extends ApiKeyACLType
  
  @js.native
  sealed trait word extends js.Object
  
  @scala.inline
  def CreateIndex: CreateIndex = "CreateIndex".asInstanceOf[CreateIndex]
  @scala.inline
  def addObject: addObject = "addObject".asInstanceOf[addObject]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def allOptional: allOptional = "allOptional".asInstanceOf[allOptional]
  @scala.inline
  def alpha: alpha = "alpha".asInstanceOf[alpha]
  @scala.inline
  def altCorrection1: altCorrection1 = "altCorrection1".asInstanceOf[altCorrection1]
  @scala.inline
  def altCorrection2: altCorrection2 = "altCorrection2".asInstanceOf[altCorrection2]
  @scala.inline
  def analytics: analytics = "analytics".asInstanceOf[analytics]
  @scala.inline
  def attribute: attribute = "attribute".asInstanceOf[attribute]
  @scala.inline
  def browse: browse = "browse".asInstanceOf[browse]
  @scala.inline
  def contains: contains = "contains".asInstanceOf[contains]
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  @scala.inline
  def deleteIndex: deleteIndex = "deleteIndex".asInstanceOf[deleteIndex]
  @scala.inline
  def deleteObject: deleteObject = "deleteObject".asInstanceOf[deleteObject]
  @scala.inline
  def editSettings: editSettings = "editSettings".asInstanceOf[editSettings]
  @scala.inline
  def endsWith: endsWith = "endsWith".asInstanceOf[endsWith]
  @scala.inline
  def exactPhrase: exactPhrase = "exactPhrase".asInstanceOf[exactPhrase]
  @scala.inline
  def excludeWords: excludeWords = "excludeWords".asInstanceOf[excludeWords]
  @scala.inline
  def firstWords: firstWords = "firstWords".asInstanceOf[firstWords]
  @scala.inline
  def ignorePlurals: ignorePlurals = "ignorePlurals".asInstanceOf[ignorePlurals]
  @scala.inline
  def is: is = "is".asInstanceOf[is]
  @scala.inline
  def lastWords: lastWords = "lastWords".asInstanceOf[lastWords]
  @scala.inline
  def listIndexes: listIndexes = "listIndexes".asInstanceOf[listIndexes]
  @scala.inline
  def logs: logs = "logs".asInstanceOf[logs]
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  @scala.inline
  def multiWordsSynonym: multiWordsSynonym = "multiWordsSynonym".asInstanceOf[multiWordsSynonym]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def oneWaySynonym: oneWaySynonym = "oneWaySynonym".asInstanceOf[oneWaySynonym]
  @scala.inline
  def partialUpdateObject: partialUpdateObject = "partialUpdateObject".asInstanceOf[partialUpdateObject]
  @scala.inline
  def partialUpdateObjectNoCreate: partialUpdateObjectNoCreate = "partialUpdateObjectNoCreate".asInstanceOf[partialUpdateObjectNoCreate]
  @scala.inline
  def placeholder: placeholder = "placeholder".asInstanceOf[placeholder]
  @scala.inline
  def prefixAll: prefixAll = "prefixAll".asInstanceOf[prefixAll]
  @scala.inline
  def prefixLast: prefixLast = "prefixLast".asInstanceOf[prefixLast]
  @scala.inline
  def prefixNone: prefixNone = "prefixNone".asInstanceOf[prefixNone]
  @scala.inline
  def recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  @scala.inline
  def rules: rules = "rules".asInstanceOf[rules]
  @scala.inline
  def search: search = "search".asInstanceOf[search]
  @scala.inline
  def seeUnretrievableAttributes: seeUnretrievableAttributes = "seeUnretrievableAttributes".asInstanceOf[seeUnretrievableAttributes]
  @scala.inline
  def settings: settings = "settings".asInstanceOf[settings]
  @scala.inline
  def singleWordSynonym: singleWordSynonym = "singleWordSynonym".asInstanceOf[singleWordSynonym]
  @scala.inline
  def startsWith: startsWith = "startsWith".asInstanceOf[startsWith]
  @scala.inline
  def stopIfEnoughMatches: stopIfEnoughMatches = "stopIfEnoughMatches".asInstanceOf[stopIfEnoughMatches]
  @scala.inline
  def strict: strict = "strict".asInstanceOf[strict]
  @scala.inline
  def synonym: synonym = "synonym".asInstanceOf[synonym]
  @scala.inline
  def synonyms: synonyms = "synonyms".asInstanceOf[synonyms]
  @scala.inline
  def updateObject: updateObject = "updateObject".asInstanceOf[updateObject]
  @scala.inline
  def usage: usage = "usage".asInstanceOf[usage]
  @scala.inline
  def word: word = "word".asInstanceOf[word]
}

